package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_296 {
    private final Production68_296 production = new Production68_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}