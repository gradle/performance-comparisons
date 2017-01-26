package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_373 {
    private final Production33_373 production = new Production33_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}