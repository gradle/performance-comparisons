package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_189 {
    private final Production68_189 production = new Production68_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}