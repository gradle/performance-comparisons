package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_296 {
    private final Production51_296 production = new Production51_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}