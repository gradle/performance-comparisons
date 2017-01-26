package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_388 {
    private final Production33_388 production = new Production33_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}