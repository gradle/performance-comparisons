package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_45 {
    private final Production1_45 production = new Production1_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}