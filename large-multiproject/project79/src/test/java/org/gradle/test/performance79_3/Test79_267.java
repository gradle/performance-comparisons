package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_267 {
    private final Production79_267 production = new Production79_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}