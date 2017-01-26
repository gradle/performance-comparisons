package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_72 {
    private final Production33_72 production = new Production33_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}