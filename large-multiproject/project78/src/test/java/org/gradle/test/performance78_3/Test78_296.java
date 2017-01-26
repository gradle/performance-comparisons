package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_296 {
    private final Production78_296 production = new Production78_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}