package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_458 {
    private final Production2_458 production = new Production2_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}