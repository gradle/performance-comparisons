package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_325 {
    private final Production79_325 production = new Production79_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}