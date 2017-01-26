package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_58 {
    private final Production78_58 production = new Production78_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}