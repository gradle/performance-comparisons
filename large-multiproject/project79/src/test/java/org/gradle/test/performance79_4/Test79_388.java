package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_388 {
    private final Production79_388 production = new Production79_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}