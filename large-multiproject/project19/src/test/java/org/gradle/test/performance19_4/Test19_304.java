package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_304 {
    private final Production19_304 production = new Production19_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}