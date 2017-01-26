package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_209 {
    private final Production85_209 production = new Production85_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}