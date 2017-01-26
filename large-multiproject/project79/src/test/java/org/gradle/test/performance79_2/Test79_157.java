package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_157 {
    private final Production79_157 production = new Production79_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}