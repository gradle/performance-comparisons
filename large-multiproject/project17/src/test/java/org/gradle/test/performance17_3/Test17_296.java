package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_296 {
    private final Production17_296 production = new Production17_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}