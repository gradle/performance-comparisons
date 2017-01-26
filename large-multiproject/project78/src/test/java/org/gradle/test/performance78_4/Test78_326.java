package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_326 {
    private final Production78_326 production = new Production78_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}