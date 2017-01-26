package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_167 {
    private final Production60_167 production = new Production60_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}