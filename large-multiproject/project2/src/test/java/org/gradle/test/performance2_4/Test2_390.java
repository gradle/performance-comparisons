package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_390 {
    private final Production2_390 production = new Production2_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}