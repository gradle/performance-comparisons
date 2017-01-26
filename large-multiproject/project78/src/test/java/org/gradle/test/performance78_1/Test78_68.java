package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_68 {
    private final Production78_68 production = new Production78_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}