package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_246 {
    private final Production19_246 production = new Production19_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}