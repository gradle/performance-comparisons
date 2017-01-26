package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_45 {
    private final Production78_45 production = new Production78_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}