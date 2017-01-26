package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_214 {
    private final Production2_214 production = new Production2_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}