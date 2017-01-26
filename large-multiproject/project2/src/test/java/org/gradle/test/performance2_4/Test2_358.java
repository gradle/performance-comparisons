package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_358 {
    private final Production2_358 production = new Production2_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}