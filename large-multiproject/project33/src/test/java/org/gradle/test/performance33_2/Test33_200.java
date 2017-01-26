package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_200 {
    private final Production33_200 production = new Production33_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}