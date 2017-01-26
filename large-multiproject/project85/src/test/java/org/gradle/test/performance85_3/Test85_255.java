package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_255 {
    private final Production85_255 production = new Production85_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}