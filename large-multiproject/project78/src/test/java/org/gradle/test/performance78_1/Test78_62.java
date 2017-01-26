package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_62 {
    private final Production78_62 production = new Production78_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}