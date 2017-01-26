package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_163 {
    private final Production33_163 production = new Production33_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}