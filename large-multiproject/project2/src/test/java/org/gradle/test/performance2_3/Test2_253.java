package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_253 {
    private final Production2_253 production = new Production2_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}