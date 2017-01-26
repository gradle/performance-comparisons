package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_347 {
    private final Production79_347 production = new Production79_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}