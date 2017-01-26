package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_100 {
    private final Production2_100 production = new Production2_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}