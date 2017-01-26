package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_112 {
    private final Production33_112 production = new Production33_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}