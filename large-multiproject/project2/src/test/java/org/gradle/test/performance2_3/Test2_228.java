package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_228 {
    private final Production2_228 production = new Production2_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}