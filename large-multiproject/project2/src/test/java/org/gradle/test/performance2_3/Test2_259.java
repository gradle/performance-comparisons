package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_259 {
    private final Production2_259 production = new Production2_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}