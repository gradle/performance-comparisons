package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_202 {
    private final Production2_202 production = new Production2_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}