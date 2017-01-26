package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_102 {
    private final Production78_102 production = new Production78_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}