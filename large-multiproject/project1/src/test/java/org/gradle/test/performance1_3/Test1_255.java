package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_255 {
    private final Production1_255 production = new Production1_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}