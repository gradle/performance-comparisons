package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_296 {
    private final Production82_296 production = new Production82_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}