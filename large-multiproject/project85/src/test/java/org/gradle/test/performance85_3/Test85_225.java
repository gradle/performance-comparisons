package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_225 {
    private final Production85_225 production = new Production85_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}