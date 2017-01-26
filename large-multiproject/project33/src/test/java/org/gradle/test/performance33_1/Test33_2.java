package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_2 {
    private final Production33_2 production = new Production33_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}