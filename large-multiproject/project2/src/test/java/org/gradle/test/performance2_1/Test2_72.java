package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_72 {
    private final Production2_72 production = new Production2_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}