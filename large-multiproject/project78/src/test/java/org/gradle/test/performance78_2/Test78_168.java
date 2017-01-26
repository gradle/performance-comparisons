package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_168 {
    private final Production78_168 production = new Production78_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}