package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_338 {
    private final Production1_338 production = new Production1_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}