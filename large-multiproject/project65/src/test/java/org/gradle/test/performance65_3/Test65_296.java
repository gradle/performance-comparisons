package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_296 {
    private final Production65_296 production = new Production65_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}