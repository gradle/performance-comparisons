package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_388 {
    private final Production2_388 production = new Production2_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}