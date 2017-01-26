package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_323 {
    private final Production78_323 production = new Production78_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}