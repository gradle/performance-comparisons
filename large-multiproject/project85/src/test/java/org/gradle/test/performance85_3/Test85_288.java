package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_288 {
    private final Production85_288 production = new Production85_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}