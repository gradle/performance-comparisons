package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_45 {
    private final Production2_45 production = new Production2_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}