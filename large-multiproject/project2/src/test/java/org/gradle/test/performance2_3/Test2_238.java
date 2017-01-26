package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_238 {
    private final Production2_238 production = new Production2_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}