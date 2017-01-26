package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_303 {
    private final Production19_303 production = new Production19_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}