package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_425 {
    private final Production1_425 production = new Production1_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}