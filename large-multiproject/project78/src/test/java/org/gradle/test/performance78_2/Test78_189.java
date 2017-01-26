package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_189 {
    private final Production78_189 production = new Production78_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}