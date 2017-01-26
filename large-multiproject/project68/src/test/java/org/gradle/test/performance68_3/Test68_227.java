package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_227 {
    private final Production68_227 production = new Production68_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}