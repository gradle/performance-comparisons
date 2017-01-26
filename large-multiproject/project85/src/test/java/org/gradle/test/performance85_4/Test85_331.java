package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_331 {
    private final Production85_331 production = new Production85_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}