package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_14 {
    private final Production78_14 production = new Production78_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}