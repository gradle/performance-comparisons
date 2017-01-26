package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_289 {
    private final Production2_289 production = new Production2_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}