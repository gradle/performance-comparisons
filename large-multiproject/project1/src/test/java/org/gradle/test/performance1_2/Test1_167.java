package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_167 {
    private final Production1_167 production = new Production1_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}